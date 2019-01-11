package Doc;

import java.util.ArrayList;

public interface DocCheck{
	public void display(ArrayList<DocCheck> docs);
	public void view(DocCheck doc);
	public boolean edit(DocCheck doc);
}