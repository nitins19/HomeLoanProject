import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegisterUserHttpService } from '../services/register-user-http.service';
import { UserloginService } from '../services/userlogin.service';
import { UserApplication } from './UserApplication';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit {

  applicationList: UserApplication[] = [];
  u2: any;
  constructor(private userLoginSer: UserloginService, private router: Router) { }

  ngOnInit(): void {
    this.u2 = sessionStorage.getItem('logindetails');
    let obj = JSON.parse(this.u2);
    console.log(obj);
    this.userLoginSer.getApplicationById(obj.userId).subscribe(
      response => {
        this.applicationList = response;
        console.log(this.applicationList);
      }
    )
  }
  track() {
    sessionStorage.setItem("appId1", JSON.stringify(this.applicationList[0].applicationId));
    this.router.navigate(['accountstatus']);
  }




}