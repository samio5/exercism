public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutes){
        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers){
        int prepTimePerLayer = 2;
        return prepTimePerLayer * layers;
    }

    public int totalTimeInMinutes(int layers, int minutes){
        return minutes + preparationTimeInMinutes(layers);
    }
}
