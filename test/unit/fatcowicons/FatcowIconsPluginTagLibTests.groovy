package fatcowicons



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(FatcowIconsPluginTagLib)
class FatcowIconsPluginTagLibTests {

    void testIcon() {
        String imgHtml = applyTemplate("<fatcow:icon iconName='accept'/>")
        assertEquals '<img src="null/images/FatCow_Icons16x16/accept.png" alt="Accept" />', imgHtml 
    }
}
