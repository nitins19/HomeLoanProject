import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminApplicationService } from '../services/admin-application.service';
import { Application } from './Application';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {

  applicationList: Application[] = [];
  constructor(private applSer: AdminApplicationService, private router: Router) { }

  Status1 = "Approved";
  Status2 = "Rejected";
  account: any;
  ngOnInit(): void {
    this.applSer.getApplicationList().subscribe(response => {
      this.applicationList = response;
    });
  }


  approveStatus(applicationId: number) {
    console.log(this.applicationList);

    let index = this.applicationList.findIndex(Application => Application.applicationId === applicationId);
    console.log(index);
    this.applSer.updateApplication(applicationId, this.Status1).subscribe(
      response => {

        this.applicationList[index].status = this.Status1;

      })
    let x = Math.floor(100000 + Math.random() * 900000);
    this.account = { accno: x, approvedamount: this.applicationList[index].loanAmount, loanapp: this.applicationList[index] };

    this.applSer.generateAccount(this.account).subscribe(response => {
      this.account = response;
    })
    alert("Approved");
  }

  rejectStatus(applicationId: number) {
    const index1 = this.applicationList.findIndex(application => application.applicationId === applicationId);
    this.applSer.updateApplication(applicationId, this.Status2).subscribe(
      response => {
        this.applicationList[index1].status = this.Status2;
        alert("Rejected");
      })
  }


}