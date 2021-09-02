package application.controller;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import application.domain.ArticleAuthor;
import application.domain.ArticleCategory;
import application.domain.ArticleCategoryRelationship;
import application.domain.ArticleComment;
import application.domain.ArticleImage;
import application.domain.ArticlePost;
import application.domain.ArticlePostRelationship;
import application.domain.ArticleTag;
import application.domain.ArticleUser;
import application.repository.ArticleAuthorRepository;
import application.repository.ArticleCategoryRelationshipRepository;
import application.repository.ArticleCategoryRepository;
import application.repository.ArticleCommentRepository;
import application.repository.ArticleImageRepository;
import application.repository.ArticlePostRelationshipRepository;
import application.repository.ArticlePostRepository;
import application.repository.ArticleTagRepository;
import application.repository.ArticleUserRepository;

@Controller
@RequestMapping(path = "/demo/api/BlogArticleServices")
public class BlogArticleController {

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

	@RequestMapping(path = "/getArticleAuthors", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleAuthors() {
		try {
			Iterable<ArticleAuthor> articleAuthor = articleAuthorRepository.findAll();
			if (articleAuthor != null) {
				return new ResponseEntity<Iterable<ArticleAuthor>>(articleAuthor, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@RequestMapping(path = "/addArticleAuthor", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticleAuthor(@RequestBody ArticleAuthor author) {
		ArticleAuthor aAuthor = new ArticleAuthor();

		try {
			articleAuthorRepository.save(aAuthor);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleAuthorById/{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findArticleAuthorById(@RequestParam Integer _id) {

		try {
			ArticleAuthor articleAuthor = articleAuthorRepository.findOne(_id);
			if (articleAuthor != null) {
				return new ResponseEntity<ArticleAuthor>(articleAuthor, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticleAuthor/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticleAuthor(@PathVariable Integer _id) {

		try {

			ArticleAuthor articleAuthor = articleAuthorRepository.findOne(_id);
			if (articleAuthor != null) {
				articleAuthorRepository.delete(_id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}

		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleCategories", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleCategories() {

		try {
			Iterable<ArticleCategory> articleCategories = articleCategoryRepository.findAll();
			if (articleCategories != null) {
				return new ResponseEntity<Iterable<ArticleCategory>>(articleCategories, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addArticleCategory", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticleCategory(@RequestBody ArticleCategory articleCategory) {

		try {
			articleCategoryRepository.save(articleCategory);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/findArticleCategoryById/{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findArticleCategoryById(@PathVariable Integer _id) {

		try {
			ArticleCategory articleCategory = articleCategoryRepository.findOne(_id);

			if (articleCategory != null) {
				return new ResponseEntity<ArticleCategory>(articleCategory, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticleCategory{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticleCategory(@PathVariable Integer _id) {
		try {

			ArticleCategory articleCategory = articleCategoryRepository.findOne(_id);
			if (articleCategory != null) {
				articleUserRepository.delete(_id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleCategoriesRelationships", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getArticleCategoriesRelationships() {

		try {
			Iterable<ArticleCategoryRelationship> articleCategoryRelationships = articleCategoryRelationshipRepository
					.findAll();
			if (articleCategoryRelationships != null) {
				return new ResponseEntity<Iterable<ArticleCategoryRelationship>>(articleCategoryRelationships,
						HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addArticleCategoryRelationship", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticleCategoryRelationship(
			@RequestBody ArticleCategoryRelationship categoryRelationship) {

		try {
			articleCategoryRelationshipRepository.save(categoryRelationship);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticleCategoryRelationship", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticleCategoryRelationship(
			@RequestBody ArticleCategoryRelationship articleCategoryRelationship) {

		try {

			ArticleCategoryRelationship relationship = articleCategoryRelationshipRepository
					.findCategoryRelationShip(articleCategoryRelationship.getCategory_id(), articleCategoryRelationship.getPost_id());
			if (relationship != null) {
				articleCategoryRelationshipRepository.delete(relationship);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else 
			{
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}

		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleComments", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleComments() {

		try {
			Iterable<ArticleComment> articleComments = articleCommentRepository.findAll();
			if (articleComments != null) {
				return new ResponseEntity<Iterable<ArticleComment>>(articleComments, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleCommentById/{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getArticleCommentById(@PathVariable Integer _id) {

		try {
			ArticleComment articleComment = articleCommentRepository.findOne(_id);
			if (articleComment != null) {
				return new ResponseEntity<ArticleComment>(articleComment, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addArticleComment", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticleComment(@RequestBody ArticleComment comment) {
		try {
			articleCommentRepository.save(comment);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticleComment/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticleComment(@PathVariable Integer _id) {

		try {
			ArticleComment articleComment = articleCommentRepository.findOne(_id);
			if (articleComment != null) {
				articleCommentRepository.delete(articleComment);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleImages", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleImages() {

		try {
			Iterable<ArticleImage> articleImages = articleImageRepository.findAll();
			if (articleImages != null) {
				return new ResponseEntity<Iterable<ArticleImage>>(articleImages, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}

		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleImageById{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleImageId(@PathVariable Integer _id) {
		try {
			ArticleImage articleImage = articleImageRepository.findOne(_id);
			if (articleImage != null) {
				return new ResponseEntity<ArticleImage>(articleImage, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addArticleImage", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticleImage(@RequestBody ArticleImage articleImage) {
		try {
			articleImageRepository.save(articleImage);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticleImage/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticleImage(@PathVariable Integer _id) {

		try {
			ArticleImage articleImage = articleImageRepository.findOne(_id);
			if (articleImage != null) {
				articleImageRepository.delete(_id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticlePostRelationships", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllPostRelationships() {

		try {

			Iterable<ArticlePostRelationship> articlePostRelationship = articlePostRelationshipRepository.findAll();
			if (articlePostRelationship != null) {
				return new ResponseEntity<Iterable<ArticlePostRelationship>>(articlePostRelationship, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addArticlePostRelationship", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticlePostRelationship(
			@RequestBody ArticlePostRelationship postRelationship) {

		try {
			articlePostRelationshipRepository.save(postRelationship);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticlePostRelationship", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticlePostRelationShip(
			@RequestBody ArticlePostRelationship relationship) {

		try {
			ArticlePostRelationship articlePostRelationship = articlePostRelationshipRepository.findArticlePostRelationship(relationship.getArticle_post_id(), relationship.getArticle_related_post_id());

			if (articlePostRelationship != null) {
				articlePostRelationshipRepository.delete(articlePostRelationship);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticlePosts", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticlePosts() {

		try {
			Iterable<ArticlePost> articlePosts = articlePostRepository.findAll();
			if (articlePosts != null) {
				return new ResponseEntity<Iterable<ArticlePost>>(articlePosts, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticlePostById{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticlePostById(@RequestParam Integer _id) {

		try {
			ArticlePost articlePost = articlePostRepository.findOne(_id);
			if (articlePost != null) {
				return new ResponseEntity<ArticlePost>(articlePost, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addArticlePost", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticlePost(@RequestBody ArticlePost post) {
		try {
			articlePostRepository.save(post);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticlePost/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticlePost(@PathVariable Integer _id) {

		try {
			ArticlePost articlePost = articlePostRepository.findOne(_id);
			if (articlePost != null) {
				articlePostRepository.delete(_id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleTags", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleTags() {

		try {
			Iterable<ArticleTag> articleTags = articleTagRepository.findAll();
			if (articleTags != null) {
				return new ResponseEntity<Iterable<ArticleTag>>(articleTags, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleTagById/{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleTagById(@PathVariable Integer _id) {

		try {
			ArticleTag articleTag = articleTagRepository.findOne(_id);
			if (articleTag != null) {
				return new ResponseEntity<ArticleTag>(articleTag, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addNewArticleTag", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticleTag(@RequestBody ArticleTag articleTag) {
		try {
			articleTagRepository.save(articleTag);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticleTag/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticleTag(@PathVariable Integer _id) {

		try {

			ArticleUser articleUser = articleUserRepository.findOne(_id);
			if (articleUser != null) {
				articleUserRepository.delete(_id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleUsers", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllArticleUsers() {

		try {
			Iterable<ArticleUser> articleUsers = articleUserRepository.findAll();
			if (articleUsers != null) {
				return new ResponseEntity<Iterable<ArticleUser>>(articleUsers, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/getArticleUserById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getArticleUserById(@RequestParam Integer userid) {

		try {
			ArticleUser articleUser = articleUserRepository.findOne(userid);
			if (articleUser != null) {
				return new ResponseEntity<ArticleUser>(articleUser, HttpStatus.OK);
			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/addNewArticleUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewArticleUser(@RequestBody ArticleUser articleUser) {

		try {
			articleUserRepository.save(articleUser);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);

		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path = "/deleteArticleUser{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteArticleUser(@PathVariable Integer _id) {

		try {
			ArticleUser articleUser = articleUserRepository.findOne(_id);
			if (articleUser != null) {
				articleUserRepository.delete(_id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);

			} else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}

		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
