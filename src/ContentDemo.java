import java.time.Year;
import java.util.ArrayList;

public class ContentDemo {

    public static void main(String[] args) {

        ArrayList<ContentItem> items = new ArrayList<>();
        items.add(new VideoLecture("Java OOP Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced Java", 2022, 120, "4K"));
        items.add(new PodcastEpisode("Tech Trends", 2023, 45, "Alice"));
        items.add(new PodcastEpisode("Code Talk", 2021, 60, "Bob"));

        int currentYear = Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(
                    item.toString() +
                            " | licenseCost=" +
                            item.getLicenseCost(currentYear)
            );

            if (item instanceof Downloable) {
                Downloable d = (Downloable) item;
                d.download();
                System.out.println("Max downloads per day: " + d.getMaxDownloadsPerDay());
            }

            System.out.println("-----------------------------------");
        }
    }
}
