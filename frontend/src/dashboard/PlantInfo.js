import { useState, useEffect } from "react";
import Tomato from "./../assets/tomato.svg";
import Basil from "./../assets/basil.svg";
import "./Dashboard.css";

const NewPlant = ({ plantType, token }) => {
  const [plantName, setPlantName] = useState("");
  const [selectedPlant, setSelectedPlant] = useState(plantType || "");
  console.log(selectedPlant);

  useEffect(() => {
    // Update selectedPlant when plantType changes
    setSelectedPlant(plantType || ""); // Set to empty string if plantType is null]
    console.log(plantType);
  }, [plantType]);

  const handleInputChange = (e) => {
    setPlantName(e.target.value);
  };

  const handleDropdownChange = (e) => {
    setSelectedPlant(e.target.value || ""); // Set to empty string if the value is null
    console.log("WDDD");
  };

  const handleAdd = () => {
    // tryAdd();
  };

  return (
    <>
      <h2 style={{ marginTop: "0px" }}>Add a Plant</h2>
      <div style={{ display: "flex", flexDirection: "row" }}>
        <div
          style={{
            backgroundColor: "white",
            width: "140px",
            height: "210px",
            marginRight: "20px",
            border: "2px solid #0a3c57",
            borderRadius: "20px",
          }}
        >
          <img
            style={{ paddingLeft: "25px", paddingTop: "30px" }}
            src={selectedPlant === "Basil" ? Basil : Tomato}
          ></img>
        </div>
        <div style={{ display: "flex", flexDirection: "column" }}>
          <label className="newLabels" htmlFor="plantName">
            Plant Name:
          </label>
          <input
            style={{ marginBottom: "20px", width: "400px" }}
            type="text"
            id="plantName"
            placeholder="Put in something cute!"
            value={plantName}
            onChange={handleInputChange}
          />
          <label className="newLabels" htmlFor="plantType">
            Plant Type:
          </label>
          <select
            style={{
              marginBottom: "20px",
              padding: "10px",
              height: "40px",
              color: "gray",
            }}
            id="plantType"
            value={selectedPlant}
            onChange={handleDropdownChange}
          >
            <option value="">Select a plant</option>
            <option value="Cherry Tomato">Cherry Tomato</option>
            <option value="Basil">Basil</option>
            <option value="Carrots">Carrots</option>
            <option value="Peas">Peas</option>
          </select>
          <button style={{ width: "100%" }} className="submit">
            Add Plant
          </button>
        </div>
      </div>
    </>
  );
};

export default NewPlant;
