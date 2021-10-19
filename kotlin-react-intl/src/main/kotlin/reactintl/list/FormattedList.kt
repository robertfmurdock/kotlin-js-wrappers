@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.list

import react.*

@JsName("FormattedList")
external class FormattedListComponent : Component<FormattedListProps, State> {
    override fun render(): ReactElement?
}

external interface FormattedListProps : IntlListFormatOptions, Props {
    var value: Array<ReactElement>
}
