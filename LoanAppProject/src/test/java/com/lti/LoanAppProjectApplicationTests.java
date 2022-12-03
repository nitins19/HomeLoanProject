package com.lti;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.lti.dto.UserResponse;
import com.lti.entity.Admin;
import com.lti.entity.Salaried;
import com.lti.entity.SelfEmployeed;
import com.lti.entity.LoanApplication;
import com.lti.entity.Property;
import com.lti.entity.User;
import com.lti.exception.AppExcep;
import com.lti.service.AdminService;
import com.lti.service.HomeLoanService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class LtiHomeLoanApplicationTests {

	@Autowired
	HomeLoanService homeser;
	
	@Autowired
	AdminService adminser;
	
	
	@MockBean
	HomeLoanService homeapp;
	
	@MockBean
	AdminService adminapp;
	
	
	@Test
	public void addUser() {
		User u1=new User(15,"Madhu"," ","S","madhu1@gmail.com","madhu@123","8975964417","04-25-2001","Female",
				"Indian",99884812,"JSHAK34242");
		System.out.println(u1);
		Mockito.when(homeapp.registerUser(u1)).thenReturn(u1);
		Assertions.assertThat(homeser.registerUser(u1).equals(u1));
		
	}
    
    @Test
    void testLogin() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	System.out.println(u1);
    	Mockito.when(homeapp.loginProcess(u1)).thenReturn(new UserResponse("Success", u1));
    	Assertions.assertThat(homeser.loginProcess(u1)).isEqualTo(u1);
    	
    	
    }
    
    @Test
	void testaddIncomeSalary() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",84229658,"AZZOJ0559T");
    	Salaried incomeSalaried = new Salaried(1,60,40000,"LTI",u1);
    	System.out.println(u1);
    	System.out.println(incomeSalaried);
    	Mockito.when(homeapp.addSalariedDetails(incomeSalaried)).thenReturn(true);
    	Assertions.assertThat(homeser.addSalariedDetails(incomeSalaried)).isEqualTo(true);
    	
    }
    
    @Test
    void testaddSelfEmployed() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	SelfEmployeed incomeSelfEmployed = new SelfEmployeed(1,30000.00,"Import Export",u1);
    	System.out.println(u1);
    	System.out.println(incomeSelfEmployed);
    	Mockito.when(homeapp.addSelfEmployeedDetails(incomeSelfEmployed)).thenReturn(true);
    	Assertions.assertThat(homeser.addSelfEmployeedDetails(incomeSelfEmployed )).isEqualTo(true);
    	
    }
    
    @Test
    void testaddLoanApplication() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	LoanApplication loanApp = new LoanApplication(6001,20000.00,30,10,"pending",u1);
    	System.out.println(u1);
    	System.out.println(loanApp);
    	Mockito.when(homeapp.addLoanDetails(loanApp)).thenReturn(true);
    	Assertions.assertThat(homeser.addLoanDetails(loanApp)).isEqualTo(true);
    	
    }
    
    @Test
    void testaddProperty() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",84229658,"AZZOJ0559T");
    	Property property = new Property(101,"Lakshmi Apartments","Bhubaneswar",6000000.00,u1);
    	System.out.println(u1);
    	System.out.println(property);
    	Mockito.when(homeapp.addPropertyDetails(property)).thenReturn(true);
    	Assertions.assertThat(homeser.addPropertyDetails(property)).isEqualTo(true);
    	
    }
    
    @Test
    void testgetUserInfoByUserId() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",84229658,"AZZOJ0559T");
    	System.out.println(u1);
    	Mockito.when(homeapp.getUserInfobyId(u1.getUserId())).thenReturn(u1);
    	Assertions.assertThat(homeser.getUserInfobyId(u1.getUserId())).isEqualTo(u1);
    }
    
    
    @Test
    void testAdminLogin() {
    	Admin a1  = new Admin(201,"Raman","byebye1@2");
    	System.out.println(a1);
    	Mockito.when(adminapp.adminLogin(a1)).thenReturn(true);
    	Assertions.assertThat(adminser.adminLogin(a1)).isEqualTo(true);
    }
    	
    @Test
    void testpendingApprovals()
    {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	LoanApplication loanApp1 = new LoanApplication(6001,20000.00,30,10,"pending",u1);
    	User u2=new User(10002,"Gayatri","Umesh","Hajare","gayatrihajare@gmail.com","ABCD@312","8975964417","2000-10-27","Female",
				"Indian",8425165,"APZOJ0559T");
    	
    	LoanApplication loanApp2 = new LoanApplication(6002,30000.00,35,10,"pending",u2);
    	List<LoanApplication> pendingLoanApplicationList = new ArrayList<>();
    	
    	pendingLoanApplicationList.add(loanApp1);
    	pendingLoanApplicationList.add(loanApp2);
    	
    	
    	Mockito.when(adminapp.viewPendingApprovals()).thenReturn(pendingLoanApplicationList);
		assertThat(adminser.viewPendingApprovals()).isEqualTo(pendingLoanApplicationList);
    	
    }
    
    
    @Test
    void testgetAllAppplications() {
    	
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	LoanApplication loanApp1 = new LoanApplication(6001,20000.00,30,10,"approved",u1);
    	User u2=new User(10002,"Gayatri","Umesh","Hajare","gayatrihajare@gmail.com","ABCD@312","8975964417","2000-10-27","Female",
				"Indian",84251658,"APZOJ0559T");
    	
    	LoanApplication loanApp2 = new LoanApplication(6002,30000.00,35,10,"pending",u2);
    	List<LoanApplication> LoanApplicationList = new ArrayList<>();
    	
    	LoanApplicationList.add(loanApp1);
        LoanApplicationList.add(loanApp2);
    	
    	
    	Mockito.when(adminapp.getAllApplications()).thenReturn(LoanApplicationList);
		assertThat(adminser.getAllApplications()).isEqualTo(LoanApplicationList);
    	
    	
    }
    
    
    @Test
    void testApprovedApplications() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	LoanApplication loanApp1 = new LoanApplication(6001,20000.00,30,10,"approved",u1);
    	User u2=new User(10002,"Gayatri","Umesh","Hajare","gayatrihajare@gmail.com","ABCD@312","8975964417","2000-10-27","Female",
				"Indian",842516589,"APZOJ0559T");
    	
    	LoanApplication loanApp2 = new LoanApplication(6002,30000.00,35,10,"approved",u2);
    	List<LoanApplication> approvedLoanApplicationList = new ArrayList<>();
    	
    	approvedLoanApplicationList.add(loanApp1);
        approvedLoanApplicationList.add(loanApp2);
    	
    	
    	Mockito.when(adminapp.approvedApplications()).thenReturn(approvedLoanApplicationList);
		assertThat(adminser.approvedApplications()).isEqualTo(approvedLoanApplicationList);
    }
    
    
    @Test
    void testRejectedApplications() {
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	LoanApplication loanApp1 = new LoanApplication(6001,20000.00,30,10,"rejected",u1);
    	User u2=new User(10002,"Gayatri","Umesh","Hajare","gayatrihajare@gmail.com","ABCD@312","8975964417","2000-10-27","Female",
				"Indian",842516589,"APZOJ0559T");
    	LoanApplication loanApp2 = new LoanApplication(6002,30000.00,35,10,"rejected",u2);
    	
    	List<LoanApplication> rejectedLoanApplicationList = new ArrayList<>();
    	rejectedLoanApplicationList.add(loanApp1);
        rejectedLoanApplicationList.add(loanApp2);
        
        Mockito.when(adminapp.rejectedApplications()).thenReturn(rejectedLoanApplicationList );
		assertThat(adminser.rejectedApplications()).isEqualTo(rejectedLoanApplicationList );
    	
    	}
    
    @Test
    void testUpdateStatus() throws AppExcep {
    	
    	User u1=new User(10001,"Ram","U","Bankra","ramanbankra1@gmail.com","ABCD12","8975964417","2000-10-27","Male",
				"Indian",842296589,"AZZOJ0559T");
    	LoanApplication loanApp = new LoanApplication(6001,20000.00,30,10,"pending",u1);
    	
    	System.out.println(u1);
    	System.out.println(loanApp);
    	
    	Mockito.when(adminapp.updatestatus(6001,"approved")).thenReturn(true);
    	Assertions.assertThat(adminser.updatestatus(6001,"approved")).isEqualTo(true);
    	
    }

}