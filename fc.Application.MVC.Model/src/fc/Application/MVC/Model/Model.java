package fc.Application.MVC.Model;

public class Model
{
	public Movie[] m_Movies;
	
	private static Model s_Model = null;
	public static Model getModel()
	{
		if (s_Model == null)
		{
			Model m =  new Model();
			m.m_Movies = new Movie[] {
					new Movie(0, "Terminator", 1984),
					new Movie(1, "Alien", 1979)
			};
			s_Model = m;
		}
		
		return s_Model;
	}
}
