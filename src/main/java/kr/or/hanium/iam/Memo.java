package kr.or.hanium.iam;
import javax.persistence.*;

@Entity
@Table(name = "test_memo")
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String memoTextselet;
}