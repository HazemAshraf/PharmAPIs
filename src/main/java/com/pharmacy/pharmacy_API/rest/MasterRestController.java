package com.pharmacy.pharmacy_API.rest;

import com.pharmacy.pharmacy_API.Model.AuthenticationRequest;
import com.pharmacy.pharmacy_API.Model.AuthenticationResponse;
import com.pharmacy.pharmacy_API.entity.ItemDetails;
import com.pharmacy.pharmacy_API.entity.ItemMaster;
import com.pharmacy.pharmacy_API.entity.User;
import com.pharmacy.pharmacy_API.service.MasterServiceImpl;
import com.pharmacy.pharmacy_API.service.MyUserDetailsService;
import com.pharmacy.pharmacy_API.service.UserServiceImpl;
import com.pharmacy.pharmacy_API.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MasterRestController {

    private MasterServiceImpl masterService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtTokenUtil;
    @Autowired
    private MyUserDetailsService userDetailsService;
    @Autowired
    private MasterServiceImpl masterServiceUser;
    @Autowired
    private UserServiceImpl UserService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        authenticate(authenticationRequest.getUserName(), authenticationRequest.getPassword());
        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUserName());
        final String token = jwtTokenUtil.generateToken(userDetails);

        String validationMessage ="success";
        String code="200";
        return ResponseEntity.ok(new AuthenticationResponse(token,code,validationMessage));
    }


    public String errorSignup(){
        return "This username or email is already exists";
    }
@RequestMapping("/signup")
public ResponseEntity<?> Signup (@RequestBody User user) throws Exception {
    User myUser = UserService.findByUsernameOrEmail(user.getUsername(),user.getEmail());
    String validationMessage ="";
    String code="200";
    if(myUser != null){
        // send response that this username or email is already exists
        System.out.println(errorSignup());
     //   errorSignup();
        validationMessage="This username or email is already exists";
    }

        masterServiceUser.saveUser(user);
        AuthenticationRequest auth = new AuthenticationRequest(user.getUsername(),user.getPassword());
        return createAuthenticationToken(auth);

}
    private void authenticate(String userName, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {

            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

    @Autowired
    public MasterRestController(MasterServiceImpl theMasterService) {
        masterService = theMasterService;
    }

    // expose "/masters" and return list of employees
    @GetMapping("/masters")
    public List<ItemMaster> findAll() {
        return masterService.findAll();
    }

    @GetMapping("/ma")
    public String findAl() {
        System.out.println("I'm Hereeeeeeeeeeeeeeeeeee");
        System.err.println("I'm Thereeeeeeeeeeeeeeeeee");
        return "Hello World";
    }

    // add mapping for GET /employees/{employeeId}
//	
    @GetMapping("/masters/{itemName}")
    public ItemMaster getItemMasterByName(@PathVariable("itemName") String itemName) {

        ItemMaster theMaster = masterService.findByItemName(itemName);

        return theMaster;
    }

    @GetMapping("/masters/byName/{itemName}")
    public List<ItemDetails> getItemDetailsByName(@PathVariable("itemName") String itemName) {
        List<ItemDetails> itemDetails = new ArrayList<ItemDetails>();
        if (itemName.isEmpty() || itemName == null) {
            itemDetails.add(new ItemDetails());

        } else {
            itemDetails = masterService.findItmByItemNameStartingWithName(itemName);
        }

        return itemDetails;
    }

    @PostMapping("/masters/save")
    public ItemMaster save(@RequestBody ItemMaster itemMaster){
        System.out.println("hereeeee");
        return masterService.save(itemMaster);
    }
    @PutMapping("/masters/update")
    public ItemMaster update(@RequestBody ItemMaster itemMaster){
        System.out.println("hereeeee");
        return masterService.save(itemMaster);
    }
//	
//	// add mapping for POST /employees - add new employee
//	
//	@PostMapping("/employees")
//	public Master addEmployee(@RequestBody Master theEmployee) {
//		
//		// also just in case they pass an id in JSON ... set id to 0
//		// this is to force a save of new item ... instead of update
//		
//		theEmployee.setId(0);
//		
//		employeeService.save(theEmployee);
//		
//		return theEmployee;
//	}
//	
//	// add mapping for PUT /employees - update existing employee
//	
//	@PutMapping("/employees")
//	public Master updateEmployee(@RequestBody Master theEmployee) {
//		
//		employeeService.save(theEmployee);
//		
//		return theEmployee;
//	}
//	
//	// add mapping for DELETE /employees/{employeeId} - delete employee
//	
//	@DeleteMapping("/employees/{employeeId}")
//	public String deleteEmployee(@PathVariable int employeeId) {
//		
//		Master tempEmployee = employeeService.findById(employeeId);
//		
//		// throw exception if null
//		
//		if (tempEmployee == null) {
//			throw new RuntimeException("Employee id not found - " + employeeId);
//		}
//		
//		employeeService.deleteById(employeeId);
//		
//		return "Deleted employee id - " + employeeId;
//	}

}
