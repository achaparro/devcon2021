package devcon.component;

import com.liferay.devcon.service.TalkLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Random;

/**
 * @author Alberto Chaparro
 */
@Component(immediate = true, service = ComponentDevCon.class)
public class ComponentDevCon {

	@Activate
	public void activate(BundleContext bundleContext) throws Exception {
		_log.info("DEVCON: Dependency with TalkLocalService fulfilled");
	}

	@Reference
	private TalkLocalService _talkLocalService;

	private static final Log _log =
		LogFactoryUtil.getLog(ComponentDevCon.class);

}