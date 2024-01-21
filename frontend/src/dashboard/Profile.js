import React from 'react';
import './Dashboard.css';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faUser } from "@fortawesome/free-solid-svg-icons";

const Profile = () => {
  return (
    <div className="profile-container">
      <div className="profile-image">
        <FontAwesomeIcon className="iconUser" icon={faUser} />
      </div>
      <div className="profile-info-container">
        <h3 className="profile-name">John Doe</h3>
        <p className="profile-description">We be-leaf in you!</p>
      </div>
    </div>
  );
};

export default Profile;
