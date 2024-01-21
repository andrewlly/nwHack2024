
import PlantReco from './PlantReco';

const RecoModal = ({openNewPlant}) => {
  return (
    <>
        <h1>Recommended Plants</h1>
        <PlantReco plantType="Cherry Tomato" openNewPlant={openNewPlant}/>
        <PlantReco plantType="Basil" openNewPlant={openNewPlant}/>
    </>
  );
};

export default RecoModal;
