export class User {


    firstName: string = "";
    lastName: string = "";
    middleName: string = "";
    emailId: string = "";
    password: string = "";
    phoneno: number;
    dob: string = "";
    gender: string = "";
    nationality: string = "";
    aadhar: number;
    pan: string;


    constructor(firstName: string, lastName: string, middleName: string, emailId: string, password: string,
        phoneno: number, dob: string, gender: string,
        nationality: string, aadhar: number, pan: string) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.emailId = emailId;
        this.password = password;
        this.phoneno = phoneno;
        this.dob = dob;
        this.gender = gender;
        this.nationality = nationality;
        this.aadhar = aadhar;
        this.pan = pan;


    }
}