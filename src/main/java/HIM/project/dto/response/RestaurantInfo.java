package HIM.project.dto.response;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@Builder
public class RestaurantInfo {
    private String restaurantName;

    private Double starPoint;

    private String restaurantThumbnail;

    private String reviewThumbnail;

    private LocalTime restaurantTime;

    private String category;

    private Boolean servicing;
    @QueryProjection
    public RestaurantInfo(String restaurantName, Double starPoint, String restaurantThumbnail, String reviewThumbnail, LocalTime restaurantTime, String category, Boolean servicing) {
        this.restaurantName = restaurantName;
        this.starPoint = starPoint;
        this.restaurantThumbnail = restaurantThumbnail;
        this.reviewThumbnail = reviewThumbnail;
        this.restaurantTime = restaurantTime;
        this.category = category;
        this.servicing = servicing;
    }
}