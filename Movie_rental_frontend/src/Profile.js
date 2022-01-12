import React, { useEffect, useState } from "react";
import "./App1.scss";

function Profile() {
  return (
    <div className="profile-main">
      <div className="profile-main-duo">
        <h1>Hello, sir!</h1>
        <div className="info">
          <div className="informatiiProfil">Nume: Crina</div>
          <div className="informatiiProfil">Prenume: Vasile</div>
          <div className="informatiiProfil">Varsta: 54</div>
          <div className="informatiiProfil">E-mail: asdads@asdas</div>
        </div>
      </div>
      <div className="filme-inchiriate">Aceastea sunt filmele inchiriate:</div>
    </div>
  );
}

export default Profile;
