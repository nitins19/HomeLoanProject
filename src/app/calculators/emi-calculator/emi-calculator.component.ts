import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emi-calculator',
  templateUrl: './emi-calculator.component.html',
  styleUrls: ['./emi-calculator.component.css']
})
export class EmiCalculatorComponent implements OnInit {

  loanAmount: number = 200000;
  tenureInMonths: number = 24;
  interest: number = 11;
  emi: number = 0;

  constructor() {}

  ngOnInit(): void {
  }

  onSubmit(emiForm: any): void {    
    console.log('you submitted value:', emiForm);
    this.loanAmount = emiForm.loanAmount;
    this.tenureInMonths = emiForm.tenureInMonths;
    this.interest=0;
    this.emi=0;
    this.calculateEmi();
  }

  calculateEmi() {
    
    console.log(Math.pow(1 + this.interest, this.tenureInMonths));

    this.interest = (this.loanAmount * (this.interest*0.01))/this.tenureInMonths;
    this.emi = Number((this.loanAmount /this.tenureInMonths + this.interest).toFixed(2));
    
    

  }
}
