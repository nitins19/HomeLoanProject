import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-eligibility-calculator',
  templateUrl: './eligibility-calculator.component.html',
  styleUrls: ['./eligibility-calculator.component.css']
})
export class EligibilityCalculatorComponent implements OnInit {
  monthlyIncome: number = 40000;
  eligibileLoanAmount: number = 0;
  val:number=0.6;

  constructor(private route:Router) { }

  ngOnInit(): void {
  }

  onSubmit(eligibilityForm: any): void {    
    console.log('you submitted value:', eligibilityForm);
    this.monthlyIncome = eligibilityForm.monthlyIncome;
    this.calculateEligibility();
    

  }

  calculateEligibility() {
    this.eligibileLoanAmount = 60 * (this.val * this.monthlyIncome)
}






}
