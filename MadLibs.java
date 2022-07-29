public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Meridel
  Date: 19/2/2032
  */
  	public static void main(String[] args){
      String name1 = "Pachinko";
      String adjective1 = "pretty";
      String adjective2 = "somber";
      String adjective3 = "light";
      String verb1 = "carry";
      String noun1 = "flower";
      String noun2 = "tree";
      String noun3 = "book";
      String noun4 = "game";
      String noun5 = "clock";
      String noun6 = "ramen";
      String name2 = "Momo";
      int number = 12;
      String place1 = "Rivendell";
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }       
}
