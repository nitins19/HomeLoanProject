import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserloginService } from 'src/app/services/userlogin.service';
import { UserLogin } from './UserLogin';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  user: any;
  userLoginForm!: FormGroup;
  constructor(private userLoginSer: UserloginService, private fb: FormBuilder, private router: Router) { }

  ngOnInit() {
    this.userLoginForm = this.fb.group({
      emailId: ['', Validators.required],
      password: ['', Validators.required],

    });
  }

  onSubmit() {

    this.userLoginSer.userlogin(this.userLoginForm.value).subscribe((Response: any) => {
      if (Response.user) {
        alert("Log in success");
        sessionStorage.setItem("logindetails", JSON.stringify(Response.user));
        this.router.navigate(['/userdashboard'])
      } else {
        alert(Response.message);
      }
    })

  }



}