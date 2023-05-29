package ekam.fithub.models.response.GetListUsers;

import java.util.List;
import lombok.Data;

@Data
public class GetListUsersResponse{
	private List<GetListUsersItemItem> item;
	private GetListUsersInfo getListUsersInfo;
}