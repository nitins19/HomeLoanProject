export class Application {

  applicationId: number = 0;
  loanAmount: number = 0;
  tenure: number = 0;
  interest: number = 0;
  status: string = "";
  user: any = 0;



  constructor(applicationId: number, loanAmount: number, tenure: number, interest: number, status: string, user: any) {
    this.applicationId = applicationId;
    this.loanAmount = loanAmount;
    this.tenure = tenure;
    this.interest = interest;
    this.status = status;
    this.user = user.userId;

  }

}