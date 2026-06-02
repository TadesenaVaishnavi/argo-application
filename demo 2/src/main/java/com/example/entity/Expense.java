@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double seedCost;
    private double fertilizerCost;
    private double laborCost;
    private double waterCost;
    private double machineryCost;
    private double transportCost;
    private double miscCost;

    private double totalCost;

    @OneToOne
    @JoinColumn(name = "crop_id")
    private Crop crop;
}