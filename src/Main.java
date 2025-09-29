public class Main {

    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient();

        ApiResponse questions = apiClient.fetchQuestions(10, "easy", "multiple");

        printOutQuestions(questions);

    }

    public static void printOutQuestions(ApiResponse questions) {

        for(ApiQuestion q : questions.results){
            System.out.println(q.question);
            System.out.println("Risposta corretta: " + q.correctAnswer);
        }

    }

}