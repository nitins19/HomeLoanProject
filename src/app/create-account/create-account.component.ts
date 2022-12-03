import { Component, OnInit } from '@angular/core';
import { UserloginService } from '../services/userlogin.service';
import { AccountDetails } from './AccountDetails';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {

  constructor(private userLoginSer: UserloginService) { }
  u3: any;
  accountlist: any;
  ngOnInit(): void {
    this.u3 = sessionStorage.getItem('appId1');
    let obj = JSON.parse(this.u3);
    console.log(obj);
    this.userLoginSer.getaccountdetails(obj).subscribe(response => {
      this.accountlist = response;
    });

  }

}