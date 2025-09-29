public class Main {

    static void main(String[] args) {

        ApiClient apiClient = new ApiClient();

        System.out.println(apiClient.fetchQuestions(10,"easy","multiple"));

    }

}