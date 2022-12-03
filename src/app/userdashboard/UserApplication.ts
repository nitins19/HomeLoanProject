export class UserApplication {
    applicationId: number = 0;
    status: string = "";
    user: any = 0;

    constructor(applicationId: number, loanAmount: number, status: string, user: any) {
        this.applicationId = applicationId;
        this.status = status;
        this.user = user.userId;
    }
}