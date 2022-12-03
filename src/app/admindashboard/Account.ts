import { LoanApplication } from "../loan-application/LoanApplication";

export class Account {
    acccno: number;
    approvedamount: number;
    loanapp: LoanApplication;
    constructor(accno: number, approvedamount: number, loanapp: LoanApplication) {
        this.acccno = accno;
        this.approvedamount = approvedamount;
        this.loanapp = loanapp;
    }
}