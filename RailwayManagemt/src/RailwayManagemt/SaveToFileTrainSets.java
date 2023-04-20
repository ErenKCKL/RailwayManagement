package RailwayManagemt;

import RailwayManagemt.entities.concretes.TrainSet;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class SaveToFileTrainSets {

    private static SaveToFileTrainSets instance;
    private List<TrainSet> trainSets;
    private static final String FILE_NAME = "SaveToFile.txt";

    private SaveToFileTrainSets(){
        trainSets = new ArrayList<>();
    }

    public static SaveToFileTrainSets getInstance(){
        if (instance == null){
            instance = new SaveToFileTrainSets();
        }
        return instance;
    }

    public void addTrainSet(TrainSet trainSet){
        trainSets.add(trainSet);
    }

    public void removeTrainSet(TrainSet trainSet){
        trainSets.remove(trainSet);
    }

    public void autoSave(){
        TimerTask saveTask = new TimerTask() {
            @Override
            public void run() {
                saveFile();
            }
        };

        Timer timer = new Timer();
        timer.schedule(saveTask, 0, 5000);

    }

    private void saveFile(){
        try(FileWriter writer = new FileWriter(FILE_NAME)){
            for(TrainSet trainSet : trainSets){
                writer.write(trainSet.toString());
                writer.write("\n");
            }
        }catch (IOException e){
            System.out.println("Error saving SaveToFile: " + e.getMessage());
        }
    }

}
