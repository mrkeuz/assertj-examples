package org.assertj.examples.data.bug26;

/**
 * {@link WithGenericListType} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractWithGenericListTypeAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class WithGenericListTypeAssert extends AbstractWithGenericListTypeAssert<WithGenericListTypeAssert, WithGenericListType> {

  /**
   * Creates a new <code>{@link WithGenericListTypeAssert}</code> to make assertions on actual WithGenericListType.
   * @param actual the WithGenericListType we want to make assertions on.
   */
  public WithGenericListTypeAssert(WithGenericListType actual) {
    super(actual, WithGenericListTypeAssert.class);
  }

  /**
   * An entry point for WithGenericListTypeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myWithGenericListType)</code> and get specific assertion with code completion.
   * @param actual the WithGenericListType we want to make assertions on.
   * @return a new <code>{@link WithGenericListTypeAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static WithGenericListTypeAssert assertThat(WithGenericListType actual) {
    return new WithGenericListTypeAssert(actual);
  }
}
