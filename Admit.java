import java.util.*;

public class Admit {
    public static void main(String[] args) {
        programIntro();
        Scanner input = new Scanner(System.in);
        // prompt
        reportStatus(input, 1, 2);
    }

    //details the purpose of the program 
    public static void programIntro() {
        System.out.println("This program compares two applicants to");
        System.out.println("determine which one seems like the stronger");
        System.out.println("applicant. For each candidate I will need");
        System.out.println("either SAT or ACT scores plus a weighted GPA.");
        System.out.println();
    }

    public static double applicantInfo(Scanner input, int app) {
        // prompt
        System.out.println("Information for applicant #" + app + ":");
        double total = totalScore(input);
        System.out.println();
        return total;
    }
    public static void reportStatus(Scanner input, int app1, int app2){
        double score1 = applicantInfo(input, app1);
        double score2 = applicantInfo(input, app2);
        System.out.println("First applicant overall score = " + score1);
        System.out.println("Second applicant overall score = " + score2);
        if(score1 > score2){
            System.out.println("The first applicant seems to be better.");
        }else if (score1 == score2){
            System.out.println("The two applicants seem to be equal.");
        }else{
            System.out.println("The second applicant seems to be better.");
        }
    }

    //returns total scores 
    public static double totalScore(Scanner input){
        double scoreForApplicant = examScores(input);
        double gpaScoreForApplicant = gpaScore(input);
        double totalScore = round1((double) scoreForApplicant + gpaScoreForApplicant);
        return totalScore;
    }

    //returns Exam Scores 
    public static double examScores(Scanner input) {
        System.out.print("\t do you have 1) SAT scores or 2) ACT scores? ");
        double score; 
        int typeOfTest = input.nextInt();
        if (typeOfTest == 1) {
            score = satScores(input);
        }else{
            score = actScores(input);
        }
        return score;
    }
    //returns SAT scores
    public static double satScores(Scanner input){
        System.out.print("\t SAT math? ");
        int satMath = input.nextInt();
        System.out.print("\t SAT critical reading? ");
        int satReading = input.nextInt();
        System.out.print("\t SAT writing? ");
        int satWriting = input.nextInt();
        double satExamScore = round1((double)(2 * satMath + satReading + satWriting) / 32);
        System.out.println("\t exam score = " + satExamScore);
        return satExamScore;
    }

    //returns ACT Scores 
    public static double actScores(Scanner input){
        System.out.print("\t ACT English? ");
        int actEnglish = input.nextInt();
        System.out.print("\t ACT Math? ");
        int actMath = input.nextInt();
        System.out.print("\t ACT Reading? ");
        int actReading = input.nextInt();
        System.out.print("\t ACT Science? ");
        int actScience = input.nextInt();
        double actExamScore = round1((double)(actEnglish + (2 * actMath + actReading + actScience)) / 1.8);
        System.out.println("\t exam score = " + actExamScore);
        return actExamScore;
    }

    //returns the gpa score of applicant
    public static double gpaScore(Scanner input){
        System.out.print("\t overall GPA? ");
        double gpa = input.nextDouble();
        System.out.print("\t max GPA? ");
        double maxGPA = input.nextDouble();
        System.out.print("\t Transcript Multiplier? ");
        double transcriptMult = input.nextDouble();
        double gpaScore = round1((gpa / maxGPA) * 100 * transcriptMult);
        System.out.println("\t GPA score = " + gpaScore);
        return gpaScore;
    }

    public static double round1(double n) {
        return Math.round(n * 10.0) / 10.0;
    }
}
