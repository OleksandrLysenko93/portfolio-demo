package OleksandrLysenko93.projects.portfoliodemo.data.project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ProjectSummary {

    private Long id;
    private String name;
    private String username;
    private String url;
    private String description;

}
