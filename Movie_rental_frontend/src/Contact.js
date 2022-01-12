import React, { useEffect, useState } from "react";
import "./App1.scss";

function Contact() {
  return (
    <div className="contact-main">
      <div>
        <div className="infos">Nume: Chebac </div>
        <div className="infos">Prenume: Alexandru</div>
        <div className="infos">Telefon: 074..</div>
        <div className="infos">E-mail: </div>
      </div>
      <div>
        <div className="infos">Nume: Ciobotariu </div>
        <div className="infos">Prenume: Rafael</div>
        <div className="infos">Telefon: 074...</div>
        <div className="infos">E-mail: </div>
      </div>
      <div>
        <div className="infos">Nume: Bogai </div>
        <div className="infos">Prenume: Tudor</div>
        <div className="infos">Telefon: 074..</div>
        <div className="infos">E-mail: </div>
      </div>
    </div>
  );
}

export default Contact;
