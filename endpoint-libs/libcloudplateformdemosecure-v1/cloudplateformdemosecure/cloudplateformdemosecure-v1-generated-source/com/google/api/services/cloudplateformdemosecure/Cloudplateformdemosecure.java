/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-03-20 15:12:36 UTC)
 * on 2013-04-02 at 17:31:13 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.cloudplateformdemosecure;

/**
 * Service definition for Cloudplateformdemosecure (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudplateformdemosecureRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Cloudplateformdemosecure extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(com.google.api.client.googleapis.GoogleUtils.VERSION.equals("1.14.1-beta"),
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.14.1-beta of google-api-client to run version " +
        "1.14.1-beta of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://quizzmyzik.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "cloudplateformdemosecure/v1/secure/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Cloudplateformdemosecure(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Cloudplateformdemosecure(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "titlesAllTitles".
   *
   * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
   * setting any optional parameters, call the {@link TitlesAllTitles#execute()} method to invoke the
   * remote operation.
   *
   * @return the request
   */
  public TitlesAllTitles titlesAllTitles() throws java.io.IOException {
    TitlesAllTitles result = new TitlesAllTitles();
    initialize(result);
    return result;
  }

  public class TitlesAllTitles extends CloudplateformdemosecureRequest<com.google.api.services.cloudplateformdemosecure.model.TitleCollection> {

    private static final String REST_PATH = "titles";

    /**
     * Create a request for the method "titlesAllTitles".
     *
     * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
     * setting any optional parameters, call the {@link TitlesAllTitles#execute()} method to invoke
     * the remote operation. <p> {@link TitlesAllTitles#initialize(com.google.api.client.googleapis.se
     * rvices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected TitlesAllTitles() {
      super(Cloudplateformdemosecure.this, "GET", REST_PATH, null, com.google.api.services.cloudplateformdemosecure.model.TitleCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public TitlesAllTitles setAlt(java.lang.String alt) {
      return (TitlesAllTitles) super.setAlt(alt);
    }

    @Override
    public TitlesAllTitles setFields(java.lang.String fields) {
      return (TitlesAllTitles) super.setFields(fields);
    }

    @Override
    public TitlesAllTitles setKey(java.lang.String key) {
      return (TitlesAllTitles) super.setKey(key);
    }

    @Override
    public TitlesAllTitles setOauthToken(java.lang.String oauthToken) {
      return (TitlesAllTitles) super.setOauthToken(oauthToken);
    }

    @Override
    public TitlesAllTitles setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (TitlesAllTitles) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public TitlesAllTitles setQuotaUser(java.lang.String quotaUser) {
      return (TitlesAllTitles) super.setQuotaUser(quotaUser);
    }

    @Override
    public TitlesAllTitles setUserIp(java.lang.String userIp) {
      return (TitlesAllTitles) super.setUserIp(userIp);
    }

    @Override
    public TitlesAllTitles set(String parameterName, Object value) {
      return (TitlesAllTitles) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "titlesCreateTitle".
   *
   * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
   * setting any optional parameters, call the {@link TitlesCreateTitle#execute()} method to invoke
   * the remote operation.
   *
   * @param id
   * @param content the {@link com.google.api.services.cloudplateformdemosecure.model.Title}
   * @return the request
   */
  public TitlesCreateTitle titlesCreateTitle(java.lang.String id, com.google.api.services.cloudplateformdemosecure.model.Title content) throws java.io.IOException {
    TitlesCreateTitle result = new TitlesCreateTitle(id, content);
    initialize(result);
    return result;
  }

  public class TitlesCreateTitle extends CloudplateformdemosecureRequest<com.google.api.services.cloudplateformdemosecure.model.Title> {

    private static final String REST_PATH = "titles";

    /**
     * Create a request for the method "titlesCreateTitle".
     *
     * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
     * setting any optional parameters, call the {@link TitlesCreateTitle#execute()} method to invoke
     * the remote operation. <p> {@link TitlesCreateTitle#initialize(com.google.api.client.googleapis.
     * services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param id
     * @param content the {@link com.google.api.services.cloudplateformdemosecure.model.Title}
     * @since 1.13
     */
    protected TitlesCreateTitle(java.lang.String id, com.google.api.services.cloudplateformdemosecure.model.Title content) {
      super(Cloudplateformdemosecure.this, "POST", REST_PATH, content, com.google.api.services.cloudplateformdemosecure.model.Title.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public TitlesCreateTitle setAlt(java.lang.String alt) {
      return (TitlesCreateTitle) super.setAlt(alt);
    }

    @Override
    public TitlesCreateTitle setFields(java.lang.String fields) {
      return (TitlesCreateTitle) super.setFields(fields);
    }

    @Override
    public TitlesCreateTitle setKey(java.lang.String key) {
      return (TitlesCreateTitle) super.setKey(key);
    }

    @Override
    public TitlesCreateTitle setOauthToken(java.lang.String oauthToken) {
      return (TitlesCreateTitle) super.setOauthToken(oauthToken);
    }

    @Override
    public TitlesCreateTitle setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (TitlesCreateTitle) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public TitlesCreateTitle setQuotaUser(java.lang.String quotaUser) {
      return (TitlesCreateTitle) super.setQuotaUser(quotaUser);
    }

    @Override
    public TitlesCreateTitle setUserIp(java.lang.String userIp) {
      return (TitlesCreateTitle) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public TitlesCreateTitle setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public TitlesCreateTitle set(String parameterName, Object value) {
      return (TitlesCreateTitle) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "titlesGetTitleById".
   *
   * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
   * setting any optional parameters, call the {@link TitlesGetTitleById#execute()} method to invoke
   * the remote operation.
   *
   * @param id
   * @return the request
   */
  public TitlesGetTitleById titlesGetTitleById(java.lang.String id) throws java.io.IOException {
    TitlesGetTitleById result = new TitlesGetTitleById(id);
    initialize(result);
    return result;
  }

  public class TitlesGetTitleById extends CloudplateformdemosecureRequest<com.google.api.services.cloudplateformdemosecure.model.Title> {

    private static final String REST_PATH = "titles/{id}";

    /**
     * Create a request for the method "titlesGetTitleById".
     *
     * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
     * setting any optional parameters, call the {@link TitlesGetTitleById#execute()} method to invoke
     * the remote operation. <p> {@link TitlesGetTitleById#initialize(com.google.api.client.googleapis
     * .services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected TitlesGetTitleById(java.lang.String id) {
      super(Cloudplateformdemosecure.this, "GET", REST_PATH, null, com.google.api.services.cloudplateformdemosecure.model.Title.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public TitlesGetTitleById setAlt(java.lang.String alt) {
      return (TitlesGetTitleById) super.setAlt(alt);
    }

    @Override
    public TitlesGetTitleById setFields(java.lang.String fields) {
      return (TitlesGetTitleById) super.setFields(fields);
    }

    @Override
    public TitlesGetTitleById setKey(java.lang.String key) {
      return (TitlesGetTitleById) super.setKey(key);
    }

    @Override
    public TitlesGetTitleById setOauthToken(java.lang.String oauthToken) {
      return (TitlesGetTitleById) super.setOauthToken(oauthToken);
    }

    @Override
    public TitlesGetTitleById setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (TitlesGetTitleById) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public TitlesGetTitleById setQuotaUser(java.lang.String quotaUser) {
      return (TitlesGetTitleById) super.setQuotaUser(quotaUser);
    }

    @Override
    public TitlesGetTitleById setUserIp(java.lang.String userIp) {
      return (TitlesGetTitleById) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public TitlesGetTitleById setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public TitlesGetTitleById set(String parameterName, Object value) {
      return (TitlesGetTitleById) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "titlesUpdateTitleById".
   *
   * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
   * setting any optional parameters, call the {@link TitlesUpdateTitleById#execute()} method to
   * invoke the remote operation.
   *
   * @param id
   * @param content the {@link com.google.api.services.cloudplateformdemosecure.model.Title}
   * @return the request
   */
  public TitlesUpdateTitleById titlesUpdateTitleById(java.lang.String id, com.google.api.services.cloudplateformdemosecure.model.Title content) throws java.io.IOException {
    TitlesUpdateTitleById result = new TitlesUpdateTitleById(id, content);
    initialize(result);
    return result;
  }

  public class TitlesUpdateTitleById extends CloudplateformdemosecureRequest<com.google.api.services.cloudplateformdemosecure.model.Title> {

    private static final String REST_PATH = "titles/{id}";

    /**
     * Create a request for the method "titlesUpdateTitleById".
     *
     * This request holds the parameters needed by the the cloudplateformdemosecure server.  After
     * setting any optional parameters, call the {@link TitlesUpdateTitleById#execute()} method to
     * invoke the remote operation. <p> {@link TitlesUpdateTitleById#initialize(com.google.api.client.
     * googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param id
     * @param content the {@link com.google.api.services.cloudplateformdemosecure.model.Title}
     * @since 1.13
     */
    protected TitlesUpdateTitleById(java.lang.String id, com.google.api.services.cloudplateformdemosecure.model.Title content) {
      super(Cloudplateformdemosecure.this, "PUT", REST_PATH, content, com.google.api.services.cloudplateformdemosecure.model.Title.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public TitlesUpdateTitleById setAlt(java.lang.String alt) {
      return (TitlesUpdateTitleById) super.setAlt(alt);
    }

    @Override
    public TitlesUpdateTitleById setFields(java.lang.String fields) {
      return (TitlesUpdateTitleById) super.setFields(fields);
    }

    @Override
    public TitlesUpdateTitleById setKey(java.lang.String key) {
      return (TitlesUpdateTitleById) super.setKey(key);
    }

    @Override
    public TitlesUpdateTitleById setOauthToken(java.lang.String oauthToken) {
      return (TitlesUpdateTitleById) super.setOauthToken(oauthToken);
    }

    @Override
    public TitlesUpdateTitleById setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (TitlesUpdateTitleById) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public TitlesUpdateTitleById setQuotaUser(java.lang.String quotaUser) {
      return (TitlesUpdateTitleById) super.setQuotaUser(quotaUser);
    }

    @Override
    public TitlesUpdateTitleById setUserIp(java.lang.String userIp) {
      return (TitlesUpdateTitleById) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public TitlesUpdateTitleById setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public TitlesUpdateTitleById set(String parameterName, Object value) {
      return (TitlesUpdateTitleById) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Cloudplateformdemosecure}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Cloudplateformdemosecure}. */
    @Override
    public Cloudplateformdemosecure build() {
      return new Cloudplateformdemosecure(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudplateformdemosecureRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudplateformdemosecureRequestInitializer(
        CloudplateformdemosecureRequestInitializer cloudplateformdemosecureRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudplateformdemosecureRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}