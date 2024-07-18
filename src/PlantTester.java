public class PlantTester {

    public static class Plant{

        private String plantBreed;
        private String plantColor;
        private String plantName;
        private String plantAdjective;

        // Constructor
        public Plant(String breed, String color, String name, String adjective){
            plantBreed = breed;
            plantColor = color;
            plantName = name;
            plantAdjective = adjective;
        }

        // toString method
        public String toString(){
            String output = plantColor + " " + plantBreed + " (" + plantName + " " + plantAdjective+ ")";
            return output;
        }
    }




    public static void main(String [] args){
        Plant swissCheesePLant = new Plant("Swiss Cheese Plant", "Green", "Monstera", "deliciosa");

        System.out.println(swissCheesePLant);
    }




}
