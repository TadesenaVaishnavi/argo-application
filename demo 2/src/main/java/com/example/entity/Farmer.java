@Entity
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String mobileNumber;

    private String password;

    private String aadhaarNumber;

    private String village;
    private String region;
}