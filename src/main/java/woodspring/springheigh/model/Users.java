package woodspring.springheigh.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document(collection = "users")
@Getter
@Setter
public class Users extends BaseEntity{

	@TextIndexed
	private String name;
	private String age;
	
	@Indexed
	private String status;
}
