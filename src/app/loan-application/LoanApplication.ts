import { User } from "../register-user/User";

export class LoanApplication {
  loanAmount: number = 0;
  tenure: number = 0;
  interest: number = 0;
  user: User;


  constructor(loanAmount: number, tenure: number, interest: number, user: User) {
    this.loanAmount = loanAmount;
    this.tenure = tenure;
    this.interest = interest;
    this.user = user;

  }
}