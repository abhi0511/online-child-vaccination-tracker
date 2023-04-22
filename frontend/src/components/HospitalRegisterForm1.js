import React from 'react';
import axios from 'axios';
import "./mainmenu.css"

const initialState = {
  hname: "",
  email: "",
  contactNo: "",
  regNo: "",
  address: "",
  username: "",
  password: "",
  pincode: "",
  hospital: {},

  pincodeErr: "",
  hnameErr: "",
  regnoerr: "",
  emailErr: "",
  contactnoErr: "",
  usernameErr: "",
  passwordErr: "",
  addressErr: ""
}

class HospitalRegisterForm extends React.Component {

  constructor(props) {
    super(props);
    this.state = initialState;
    // this.state = {

    //   hname: "",
    //   email: "",
    //   contactNo: "",
    //   regNo: "",
    //   address: "",
    //   username: "",
    //   password: "",
    //   pincode: "",
    //   hospital: {}
    // }
  }

  validate = () => {
    let hnameErr = "";
    let emailErr = "";
    let contactnoErr = "";
    let regnoerr = "";
    let usernameErr = "";
    let addressErr = "";
    let passwordErr = "";
    let pincodeErr = "";
    if (this.state.hname.trim() == 0 || this.state.hname.length < 2) {
      hnameErr = "First Name should contain at least 5 characters";
    }
    if (this.state.regNo.trim() == 0 || this.state.regNo.length < 2) {
      regnoerr = "Registration number is manadatory";
    }
    if (!(this.state.pincode.length === 6)) {
      pincodeErr = "Invalid pincode";
    }
    if (!this.state.email.includes("@")) {
      emailErr = "Invalid Email";
    }
    if (!(this.state.contactNo.length === 10)) {
      contactnoErr = "Invalid contact number";
    }
    if (this.state.username.length < 5) {
      usernameErr = "Username should contain at least 5 characters ";
    }
    if (this.state.password.length < 5) {
      passwordErr = "Password should contain at least 5 characters ";
    }
    if (this.state.address.length < 5) {
      addressErr = "Address Length not less than 5 characters ";
    }
    if (hnameErr || regnoerr || emailErr || passwordErr || usernameErr || addressErr || contactnoErr || pincodeErr) {
      this.setState({ hnameErr, regnoerr, emailErr, passwordErr, usernameErr, addressErr, contactnoErr, pincodeErr });
      return false;
    }
    return true;
  }


  handleChange = (e) => {
    const nm = e.target.name;
    const val = e.target.value;
    this.setState({ [nm]: val });

  }

  submitData = (e) => {
    e.preventDefault()
    const isValid = this.validate();
    if (isValid) {
      console.log(this.state)
      axios
        .post('http://localhost:9009/hospital/hospitalregister', this.state)
        .then(response => {
          alert("Registration Successful!")
          this.props.history.push("/login");
        })
        .catch(error => {
          alert("Invalid credential")
          this.props.history.push("/hospitalregister");
        })
      this.setState(initialState);
    } else {
      this.props.history.push("/hospitalregister");
    }
  }

  render() {
    return (
      <div>
        <div className="container"><br />
          <h1 className="header2">Hospital Registration</h1>


          <form className="hospital">
            <div className="form-group">
              <label className="lb" for="hname">Enter Hospital Name :</label>
              <input type="text" id="hname" className="form-control" name="hname" onChange={this.handleChange}
                placeholder="Enter Hospital Name" required autofocus />
            </div>
            <div style={{ fontSize: 16, color: "red" }}>
              {this.state.hnameErr}
            </div>

            <div className="form-group" >
              <label className="lb" for="email">Enter EmailID :</label>
              <input type="email" id="email" className="form-control" name="email" onChange={this.handleChange}
                placeholder="Enter EmailID" required />
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
              <label className="lb" for="regNo">Enter Register No. :</label>
              <input type="text" id="regNo" className="form-control" name="regNo" onChange={this.handleChange}
                placeholder="Enter Register No." required
              />
            </div>
            <div style={{ fontSize: 16, color: "red" }}>
              {this.state.regnoerr}
            </div>

            <div className="form-group" >
              <label className="lb" for="address">Enter Address :</label>
              <input type="text" id="address" className="form-control" name="address" onChange={this.handleChange}
                placeholder="Enter Address" required />
            </div>
            <div style={{ fontSize: 16, color: "red" }}>
              {this.state.addressErr}
            </div>
            <div className="form-group" >
              <label className="lb" for="pincode">Enter Pincode:</label>
              <input type="number" id="pincode" className="form-control" name="pincode" onChange={this.handleChange}
                placeholder="Enter Pincode" required
              />
            </div>
            <div style={{ fontSize: 16, color: "red" }}>
              {this.state.pincodeErr}
            </div>

            <div className="form-group" >
              <label className="lb" for="username">Enter Username  :</label>
              <input type="text" id="username" className="form-control" name="username" onChange={this.handleChange}
                placeholder="Enter Username" required
              />
            </div>
            <div style={{ fontSize: 16, color: "red" }}>
              {this.state.usernameErr}
            </div>
            <div className="form-group">
              <label className="lb" for="password"> Enter Password :</label>
              <input type="password" id="password" className="form-control" name="password" onChange={this.handleChange}
                placeholder="Enter Password" required /><br />
            </div>
            <div style={{ fontSize: 16, color: "red" }}>
              {this.state.passwordErr}
            </div><br />
            <div className="form-group" class="rows">
              <button type="button" onClick={this.submitData} class="btn btn-primary col-md-5" style={{ marginLeft: "25px" }}>SUBMIT</button>
              <button class="btn btn-primary col-md-5" style={{ marginLeft: "20px" }}>RESET</button>

            </div>
          </form>
        </div>

      </div>
    )
  }

}

export default HospitalRegisterForm;