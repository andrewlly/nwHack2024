import { useState } from 'react';
import Tomato from './../assets/tomato.svg'
import Basil from './../assets/basil.svg'

const NewPlant = ({plantType}) => {
  const [plantName, setPlantName] = useState("");
  const [selectedPlant, setSelectedPlant] = useState(plantType);
  console.log(selectedPlant);

  const handleInputChange = (e) => {
    setPlantName(e.target.value);
  };

  const handleDropdownChange = (e) => {
    setSelectedPlant(e.target.value);
  };

  return (
    <>
        <h1>Add a Plant</h1>
        <div style={{display: 'flex', flexDirection: 'row'}}>
          <div style={{backgroundColor: 'white', width: '50%', height: '400'}}>
            <img src={selectedPlant === "Basil" ? Basil : Tomato}></img>
          </div>
          <div style={{display: 'flex', flexDirection: 'column'}}>
            <label htmlFor="plantName">Plant Name:</label>
            <input
              type="text"
              id="plantName"
              value={plantName}
              onChange={handleInputChange}
            />
            <label htmlFor="plantType">Plant Type:</label>
            <select
              id="plantType"
              value={plantType}
              onChange={handleDropdownChange}
            >
              <option value="">Select a plant</option>
              <option value="Cherry Tomatoes">Cherry Tomatoes</option>
              <option value="Basil">Basil</option>
            </select>
          </div>
        </div>
    </>
  );
};

export default NewPlant;
