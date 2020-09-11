package samples

import kotlinext.js.jsObject
import react.*
import react.dom.div
import react.dom.h1
import react.dom.h2
import reactintl.IntlShape
import reactintl.WrappedComponentProps
import reactintl.injectIntl
import reactintl.provider.intlProvider
import reactintl.useIntl
import kotlin.js.Date

private val comp = functionalComponent<RProps> {
    val formatDate = useIntl()

    h1 { +formatDate.formatDate(Date.now()) }
}

interface Comp2Props : WrappedComponentProps<Any> {
    var intl: IntlShape
}

private class Comp2 : RComponent<Comp2Props, RState>() {
    override fun RBuilder.render() {
        h1 { +props.intl.formatDate(Date.now(), jsObject { month = "long" }) }
        h2 { +props.intl.formatTime(undefined) }
    }
}

fun RBuilder.comp2WithIntl(handler: RHandler<Comp2Props>) =
    child(injectIntl<Any, Comp2Props>(Comp2::class.js), jsObject {}, handler)

private val app = functionalComponent<RProps> {
    intlProvider {
        attrs {
            locale = "en"
            timeZone = "Asia/Tokyo"
        }
        div {
            child(comp)
            comp2WithIntl {}
        }
    }
}

fun RBuilder.injected() = child(app)
