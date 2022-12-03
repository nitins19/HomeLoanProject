import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoanApplicationService } from '../services/loan-application.service';

@Component({
  selector: 'app-loan-application',
  templateUrl: './loan-application.component.html',
  styleUrls: ['./loan-application.component.css']
})
export class LoanApplicationComponent implements OnInit {

  LoanApplicationForm!: FormGroup;
  loan: any;
  u1: any;
  constructor(private loanSer: LoanApplicationService, private fb: FormBuilder, private router: Router) { }

  ngOnInit() {
    this.u1 = sessionStorage.getItem('userId');
    let obj = JSON.parse(this.u1);
    console.log(obj);
    console.log(obj.userId);
    this.LoanApplicationForm = this.fb.group({
      loanAmount: ['', Validators.required],
      tenure: ['', Validators.required],
      interest: ['', Validators.required],
      status: ['pending', Validators.required],
      user: [obj]

    });

  }

  onSubmit() {
    this.loanSer.addLoanInfo(this.LoanApplicationForm.value).subscribe(
      Response => {
        alert("record added , login to check loan status")
        this.loan = Response;
        this.router.navigate(['/dashboard']);
      });

  }




}
