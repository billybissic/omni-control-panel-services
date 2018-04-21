package application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/ArticleServices")
public class ArticleController {
	
	@Autowired
	private ArticleAuthorRepository articleAuthorRepository;
	@Autowired
	private ArticleCategoryRepository articleCategoryRepository;
	@Autowired
	private ArticleCategoryRelationshipRepository articleCategoryRelationshipRepository;
	@Autowired
	private ArticleCommentRepository articleCommentRepository;
	@Autowired
	private ArticleImageRepository articleImageRepository;
	@Autowired
	private ArticlePostRelationshipRepository articlePostRelationshipRepository;
	@Autowired
	private ArticlePostRepository articlePostRepository;
	@Autowired
	private ArticleTagRepository articleTagRepository;
	@Autowired
	private ArticleUserRepository articleUserRepository;
	
	@GetMapping(path="/getArticleAuthors")
	public @ResponseBody Iterable<ArticleAuthor> getAllArticleAuthors()
	{
		return articleAuthorRepository.findAll();	
	}
	
	@GetMapping(path="/addArticleAuthor")
	public @ResponseBody String addNewArticleAuthor(@RequestParam String displayname, 
													@RequestParam String firstname,
													@RequestParam String lastname
													) {
		ArticleAuthor aAuthor = new ArticleAuthor();
		aAuthor.setDisplay_name(displayname);
		aAuthor.setFirst_name(firstname);
		aAuthor.setLast_name(lastname);
		articleAuthorRepository.save(aAuthor);
		return "Saved";
	}

	@GetMapping(path="/getArticleAuthorById")
	public @ResponseBody ArticleAuthor findArticleAuthorById(@RequestParam Long authorid) {
		return articleAuthorRepository.findOne(authorid);
	}
	
	@GetMapping(path="/deleteArticleAuthor")
	public @ResponseBody String deleteArticleAuthor(@RequestParam Integer authorId) {
		ArticleAuthor aAuthor = new ArticleAuthor();
		aAuthor.setId(authorId);
		articleAuthorRepository.save(aAuthor);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticleCategories")
	public @ResponseBody Iterable<ArticleCategory> getAllArticleCategories()
	{
		return articleCategoryRepository.findAll();
	}
	
	@GetMapping(path="/addArticleCategory")
	public @ResponseBody String addNewArticleCategory(@RequestParam String name,
													  @RequestParam Integer enabled) {
		ArticleCategory aCategory = new ArticleCategory();
		aCategory.setName(name);
		aCategory.setEnabled(enabled);
		articleCategoryRepository.save(aCategory);
		return "Saved";
	}

	@GetMapping(path="/findArticleCategoryById")
	public @ResponseBody ArticleCategory findArticleCategoryById(@RequestParam Long categoryId) {
		return articleCategoryRepository.findOne(categoryId);
	}
	
	@GetMapping(path="/deleteArticleCategory")
	public @ResponseBody String deleteArticleCategory(@RequestParam Integer id) {
		ArticleCategory aCategory = new ArticleCategory();
		aCategory.setId(id);
		articleCategoryRepository.delete(aCategory);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticleCategoriesRelationships")
	public @ResponseBody Iterable<ArticleCategoryRelationship> getArticleCategoriesRelationships()
	{
		return articleCategoryRelationshipRepository.findAll();
	}
	
	@GetMapping(path="/addArticleCategoryRelationship")
	public @ResponseBody String addNewArticleCategoryRelationship(@RequestParam Integer categoryid,
																  @RequestParam Integer postid) {
		ArticleCategoryRelationship aCategoryRelationship = new ArticleCategoryRelationship();
		aCategoryRelationship.setCategory_id(categoryid);
		aCategoryRelationship.setPost_id(postid);
		articleCategoryRelationshipRepository.save(aCategoryRelationship);
		return "Saved";
	}
	
	@GetMapping(path="/deleteArticleCategoryRelationship")
	public @ResponseBody String deleteArticleCategoryRelationship(@RequestParam Integer categoryid,
																  @RequestParam Integer postid) {
		
		ArticleCategoryRelationship aCategoryRelationship = new ArticleCategoryRelationship();
		aCategoryRelationship.setCategory_id(categoryid);
		aCategoryRelationship.setPost_id(postid);
		articleCategoryRelationshipRepository.delete(aCategoryRelationship);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticleComments")
	public @ResponseBody Iterable<ArticleComment> getAllArticleComments()
	{
		return articleCommentRepository.findAll();
	}
	
	@GetMapping(path="/getArticleCommentById")
	public @ResponseBody ArticleComment getArticleCommentById(@RequestParam Long commentid) {
		return articleCommentRepository.findOne(commentid);
	}
	
	@GetMapping(path="/addArticleComment")
	public @ResponseBody String addNewArticleComment (@RequestParam Integer postid,
													  @RequestParam Integer commentid,
													  @RequestParam String comment,
													  @RequestParam Integer userid,
													  @RequestParam Integer read,
													  @RequestParam Integer enabled) {
		ArticleComment aComment = new ArticleComment();
		aComment.setPost_id(postid);
		aComment.setIs_reply_to_id(commentid);
		aComment.setComment(comment);
		aComment.setUser_id(userid);
		aComment.setMark_read(read);
		aComment.setEnabled(enabled);
		articleCommentRepository.save(aComment);
		return "Saved";
	}
	
	@GetMapping(path="/deleteArticleComment")
	public @ResponseBody String deleteArticleComment(@RequestParam Integer id) {
		ArticleComment aComment = new ArticleComment();
		aComment.setId(id);
		articleCommentRepository.delete(aComment);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticleImages")
	public @ResponseBody Iterable<ArticleImage> getAllArticleImages()
	{
		return articleImageRepository.findAll();
	}
	
	@GetMapping(path="/getArticleImageById")
	public @ResponseBody ArticleImage getAllArticleImageId(@RequestParam Long imagedid)
	{
		return articleImageRepository.findOne(imagedid);
	}
	
	@GetMapping(path="/addArticleImage")
	public @ResponseBody String addNewArticleImage (@RequestParam String image,
													@RequestParam Integer articlepostid) {
		ArticleImage aImage = new ArticleImage();
		aImage.setImage(image);
		aImage.setArticle_post_id(articlepostid);
		articleImageRepository.save(aImage);
		return "Saved";
	}
	
	@GetMapping(path="/deleteArticleImage")
	public @ResponseBody String deleteArticleImage (@RequestParam Integer id) {
		ArticleImage aImage = new ArticleImage();
		aImage.setId(id);
		articleImageRepository.delete(aImage);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticlePostRelationships")
	public @ResponseBody Iterable<ArticlePostRelationship> getAllPostRelationships()
	{
		return articlePostRelationshipRepository.findAll();
	}
	
	@GetMapping(path="/addArticlePostRelationship")
	public @ResponseBody String addNewArticlePostRelationship(@RequestParam Integer articlepostid,
												  @RequestParam Integer articlerelatedpostid) {
		ArticlePostRelationship aPostRelationship = new ArticlePostRelationship();
		aPostRelationship.setArticle_post_id(articlepostid);
		aPostRelationship.setArticle_related_post_id(articlerelatedpostid);
		articlePostRelationshipRepository.save(aPostRelationship);
		return "Saved";
	}
	
	@GetMapping(path="/deleteArticlePostRelationship")
	public @ResponseBody String deleteArticlePostRelationShip(@RequestParam Integer articlepostid,
															  @RequestParam Integer articlerelatedpostid) {
		ArticlePostRelationship aPostRelationship = new ArticlePostRelationship();
		aPostRelationship.setArticle_post_id(articlepostid);
		aPostRelationship.setArticle_related_post_id(articlerelatedpostid);
		articlePostRelationshipRepository.delete(aPostRelationship);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticlePosts")
	public @ResponseBody Iterable<ArticlePost> getAllArticlePosts()
	{
		return articlePostRepository.findAll();
	}
	
	@GetMapping(path="/getArticlePostById")
	public @ResponseBody ArticlePost getAllArticlePostById(@RequestParam Long postid)
	{
		return articlePostRepository.findOne(postid);
	}
	
	
	@GetMapping(path="/addArticlePost")
	public @ResponseBody String addNewArticlePost(@RequestParam String title,
												  @RequestParam String article,
												  @RequestParam String file,
												  @RequestParam Integer authorid,
												  @RequestParam String bannerimage,
												  @RequestParam Integer featured,
												  @RequestParam Integer enabled,
												  @RequestParam Integer commentsenabled) {
		ArticlePost aPost = new ArticlePost();
		aPost.setTitle(title);
		aPost.setArticle(article);
		aPost.setFile(file);
		aPost.setAuthor_id(authorid);
		aPost.setBanner_image(bannerimage);
		aPost.setFeatured(featured);
		aPost.setEnabled(enabled);
		aPost.setComments_enabled(commentsenabled);
		articlePostRepository.save(aPost);
		return "Saved";
	}
	
	public @ResponseBody String deleteArticlePost(@RequestParam Integer postid) {
		ArticlePost aPost = new ArticlePost();
		aPost.setId(postid);
		articlePostRepository.delete(aPost);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticleTags")
	public @ResponseBody Iterable<ArticleTag> getAllArticleTags()
	{
		return articleTagRepository.findAll();
	}
	
	@GetMapping(path="/getArticleTagById")
	public @ResponseBody ArticleTag getAllArticleTagById(@RequestParam Long tagid)
	{
		return articleTagRepository.findOne(tagid);
	}
	
	@GetMapping(path="/addNewArticleTag")
	public @ResponseBody String addNewArticleTag(@RequestParam Integer postid,
												 @RequestParam String tag) {
		ArticleTag aTag = new ArticleTag();
		aTag.setPost_id(postid);
		aTag.setTag(tag);
		articleTagRepository.save(aTag);
		return "Saved";
	}
	
	@GetMapping(path="/deleteArticleTag")
	public @ResponseBody String deleteArticleTag(@RequestParam Integer tagid) {
		ArticleTag aTag = new ArticleTag();
		aTag.setId(tagid);
		articleTagRepository.delete(aTag);
		return "Deleted";
	}
	
	@GetMapping(path="/getArticleUsers")
	public @ResponseBody Iterable<ArticleUser> getAllArticleUsers()
	{
		return articleUserRepository.findAll();
	}
	
	@GetMapping(path="/getArticleUserById")
	public @ResponseBody ArticleUser getAllArticleUserById(@RequestParam Long userid)
	{
		return articleUserRepository.findOne(userid);
	}
	
	@GetMapping(path="/addNewArticleUser")
	public @ResponseBody String addNewArticleUser(@RequestParam String name,
												  @RequestParam String email,
												  @RequestParam String website,
												  @RequestParam String displayname) {
		ArticleUser aUser = new ArticleUser();
		aUser.setName(name);
		aUser.setEmail(email);
		aUser.setWebsite(website);
		aUser.setDisplay_name(displayname);
		articleUserRepository.save(aUser);
		return "Saved";
	}
	
	@GetMapping(path="/deleteArticleUser")
	public @ResponseBody String deleteArticleUser(@RequestParam Integer userid) { 
		ArticleUser aUser = new ArticleUser();
		aUser.setId(userid);
		articleUserRepository.delete(aUser);
		return "Deleted";
	}

}
