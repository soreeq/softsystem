package exam;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ResultAnalyzer {
    private List<Participant> participants;

    public ResultAnalyzer() {
        participants = new ArrayList<>();
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void sortByTotalPoints() {
        Collections.sort(participants, (p1, p2) -> Integer.compare(p2.getTotalPoints(), p1.getTotalPoints()));
    }

    public void printResults() {
        for (Participant participant : participants) {
            System.out.println(participant.getResult());
        }
    }

    public void saveResultsToFile(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for (Participant participant : participants) {
            writer.write(participant.getResult() + "\n");
        }
        writer.close();
    }
}