import { useState } from 'react';
import './Quiz.css';

function Quiz() {
    const [query, setQuery] = useState("");
    const [formData, setFormData] = useState({
        plantType: '',
        time: '',
        sunlight: '',
        space: ''
      });

    const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(formData);
    setQuery(`Find me a ${formData.plantType} houseplant to grow based on the following criteria, with 1 being the least and 3 being the most.`
    + " time: " + formData.time + " light: " + formData.sunlight + " space: " + formData.space);
  };

  return (
    <div className="Quiz">
        <h1>Find your new best bud.</h1>
        <form onSubmit={handleSubmit} style={{display: 'flex', flexDirection: 'column'}}>
            <h3>Are you looking for an:</h3>
            <label> 
                <input type="radio" name="plantType" value="outdoor" onChange={handleChange}/>
                Outdoor Plant 
            </label>
            <label>
                <input type="radio" name="plantType" value="indoor" onChange={handleChange}/>
                Indoor Plant 
            </label>
            <h3>Are you a person that has time to water?</h3>
            <label> 
                <input type="radio" name="time" value="3" onChange={handleChange}/>
                Yes, I've got lots of thyme!
            </label>
            <label>
                <input type="radio" name="time" value="2" onChange={handleChange}/>
                I can sprinkle some time here and there
            </label>
            <label>
                <input type="radio" name="time" value="1" onChange={handleChange}/>
                I'm sooooo busy
            </label>
            <h3>How much sunlight do you get?</h3>
            <label> 
                <input type="radio" name="sunlight" value="3" onChange={handleChange}/>
                I'm practically bathing in it. 
            </label>
            <label>
                <input type="radio" name="sunlight" value="2" onChange={handleChange}/>
                Enough for my daily dose of Vitamin D.
            </label>
            <label>
                <input type="radio" name="sunlight" value="1" onChange={handleChange}/>
                Sunlight? What's that?
            </label>
            <h3>How much space do you have?</h3>
            <label>
                <input type="radio" name="space" value="3" onChange={handleChange}/>
                I have a tree-mendous amount of space.
            </label>
            <label>
                <input type="radio" name="space" value="2" onChange={handleChange}/>
                I've got some room, but I can't branch out too much.
            </label>
            <label> 
                <input type="radio" name="space" value="1" onChange={handleChange}/>
                I've got a lily bit of space.
            </label>
            <div>
                <input type="submit" value="Find me a plant"/>
                <input type="button" value="Skip" />
            </div>
        </form>
    </div>
  );
}

export default Quiz;