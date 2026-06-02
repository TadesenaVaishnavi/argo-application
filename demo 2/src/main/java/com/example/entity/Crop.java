@Entity
public class Crop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cropName;
    private LocalDate plantationDate;
    private double fieldSize;
    private String seedType;
    private String fertilizerUsed;
    private String irrigationMethod;
    private LocalDate expectedHarvestDate;
    private String harvestStatus;

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;
}