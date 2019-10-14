import React from 'react';
import { Link } from 'react-router-dom';
import '../App.css';

function myFunction() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
      x.className += " responsive";
    } else {
      x.className = "topnav";
    }
}

function Navbar() {
  return (
        <div className="topnav" id="myTopnav">
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
    <Link to="/orders">Orders</Link>
    <Link to="/customers">Customers</Link>

  <button className="icon" onClick={myFunction}>
    <i className="fa fa-bars"></i>
  </button>
</div>
  );
}

export default Navbar;
