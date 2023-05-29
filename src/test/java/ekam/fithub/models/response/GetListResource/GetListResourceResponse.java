package ekam.fithub.models.response.GetListResource;

import java.util.List;
import lombok.Data;

@Data
public class GetListResourceResponse{
	private int perPage;
	private int total;
	private List<GetListResourceDataItem> data;
	private int page;
	private int totalPages;
	private GetListResourceSupport support;
}