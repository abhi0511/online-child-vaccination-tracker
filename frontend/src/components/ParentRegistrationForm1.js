import axios from 'axios';
import React from 'react';
import "./mainmenu.css"

const initialState = {
    fname: "",
    lname: "",
    email: "",
    contactNo: "",
    address: "",
    adharNo: "",
    username: "",
    password: "",
    parent: {},

    fnameErr: "",
    lnameErr: "",
    emailErr: "",
    contactnoErr: "",
    adharNoErr: "",
    addressErr: "",
    passwordErr: "",
    usernameErr: ""
}

class ParentRegistrationForm extends React.Component {


    constructor(props) {
        super(props);
        this.state = initialState;
        // {
        //   // fname: "",
        //   // lname: "",
        //   // email: "",
        //   // contactno: "",
        //   // address: "",
        //   // adharNo: "",
        //   // username: "",
        //   // password: "",
        //   // parent: {},

        //   // fnameErr: ""
        // }
    }

    handleChange = (e) => {
        const nm = e.target.name;
        const val = e.target.value;
        this.setState({ [nm]: val });

    }

    validate = () => {
        let fnameErr = "";
        let lnameErr = "";
        let contactnoErr = "";
        let emailErr = "";
        let adharNoErr = "";
        let addressErr = "";
        let passwordErr = "";
        let usernameErr = "";
        if (this.state.fname.trim() === 0 || this.state.fname.length < 2) {
            fnameErr = "First Name cannot be empty and should contain at least 2 characters";
        }
        if (this.state.lname.trim() === 0 || this.state.lname.length < 2) {
            lnameErr = "Last Name cannot be empty and should contain at least 2 characters";
        }
        if (!this.state.email.includes("@")) {
            emailErr = "Invalid Email";
        }
        if (!(this.state.contactNo.length === 10)) {
            contactnoErr = "Invalid contact number";
        }
        if (!(this.state.adharNo.length === 12)) {
            adharNoErr = "Invalid Aadhar Number ";
        }
        if (this.state.address.length >16) {
            addressErr = "Address Length not exceed 16 characters ";
        }
        if (this.state.username.length <5) {
            usernameErr = "Username should contain at least 5 characters ";
        }
        if (this.state.password.length <5) {
            passwordErr = "Password should contain at least 5 characters ";
        }
        if (fnameErr || lnameErr || emailErr || contactnoErr || adharNoErr || addressErr || passwordErr || usernameErr) {
            this.setState({ fnameErr, lnameErr, emailErr, contactnoErr, adharNoErr, addressErr, passwordErr, usernameErr });
            return false;
        }
        return true;
    }

    submitData = (e) => {
        e.preventDefault()

        const isValid = this.validate();
        if (isValid) {
            console.log(this.state)
            alert("success")
            axios
                .post('http://localhost:9009/parent/registerParent', this.state)
                .then(response => {
                    alert("Registration Successful...")
                    this.props.history.push("/login");
                })
                .catch(error => {
                    alert("Duplicate Username")
                    this.props.history.push("/parentregister");
                })

            //clear form (Optional in our case)
            this.setState(initialState);
        } //end of if(isValid)
        // else{
        //     this.props.history.push("/parentregister");
        // }

    }

    render() {
        const { errors } = this.state;
        return (

            <div className="container">
                <h1 className="header1">Parent Registration</h1><br />
                <form className="parentform">
                    <div className="form-group" >
                        <label className="lb" for="fname">Enter First Name :</label>
                        <input type="text" id="fname" className="form-control" name="fname" onChange={this.handleChange} />
                    </div>
                    {/* Error msg */}
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.fnameErr}
                    </div>

                    <div className="form-group" >
                        <label className="lb" for="lname">Enter Last Name :</label>
                        <input type="text" id="lname" className="form-control" name="lname" onChange={this.handleChange} />
                    </div>
                    {/* Error msg */}
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.lnameErr}
                    </div>

                    <div className="form-group" >
                        <label className="lb" for="email">Enter EmailID :</label>
                        <input type="text" id="email" className="form-control" name="email" onChange={this.handleChange} />
                    </div>
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.emailErr}
                    </div>
                    <div className="form-group" >
                        <label className="lb" for="contactNo">Enter Contact No. :</label>
                        <input type="tel" id="contactNo" className="form-control" name="contactNo" onChange={this.handleChange}
                            placeholder="Enter  Contact No."
                        />
                    </div>
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.contactnoErr}
                    </div>

                    <div className="form-group"  >
                        <label className="lb" for="aadharNo">Enter Aadhar No. :</label>
                        <input type="number" id="adharNo" className="form-control" name="adharNo" onChange={this.handleChange} />
                    </div>
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.adharNoErr}
                    </div>

                    <div className="form-group" >
                        <label className="lb" for="address">Enter Address :</label>
                        <input type="text" id="address" className="form-control" name="address" onChange={this.handleChange} />
                    </div>
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.addressErr}
                    </div>
                    <div className="form-group" >
                        <label className="lb" for="username">Enter Username :</label>
                        <input type="text" id="username" className="form-control" name="username" onChange={this.handleChange} />
                    </div>
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.usernameErr}
                    </div>
                    <div className="form-group">
                        <label className="lb" for="password"> Enter Password :</label>
                        <input type="password" id="password" className="form-control" name="password" onChange={this.handleChange} />
                    </div>
                    <div style={{ fontSize: 16, color: "red" }}>
                        {this.state.passwordErr}
                    </div><br/>
                    <div className="form-group" class="rows">
                        <button type="submit" class="btn btn-primary col-md-5" onClick={this.submitData} style={{ marginLeft: "20px" }}>SUBMIT</button>
                        <button type="reset" class="btn btn-primary col-md-5" style={{ marginLeft: "30px" }}>RESET</button>
                    </div>
                    {/* {Object.keys(errors).map((key)=>{
            return <div style={{color:"red"}} key={key}>{errors[key]}</div>
          })}  */}
                </form>

            </div>

        )
    }
}

export default ParentRegistrationForm;