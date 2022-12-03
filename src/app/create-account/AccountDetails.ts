export class AccountDetails {
    acccno: number;
    approvedamount: number;

    constructor(accno: number, approvedamount: number) {
        this.acccno = accno;
        this.approvedamount = approvedamount;
    }
}