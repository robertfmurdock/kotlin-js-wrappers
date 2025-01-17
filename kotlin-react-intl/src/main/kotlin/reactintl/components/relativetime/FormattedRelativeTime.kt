@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.relativetime

import react.*
import reactintl.*
import reactintl.components.number.IntlNumber
import reactintl.components.plural.IntlPlural

@JsName("FormattedRelativeTime")
external class FormattedRelativeTimeComponent : Component<FormattedRelativeTimeProps, State> {
    override fun render(): ReactElement?
}

external interface FormattedRelativeTimeProps : FormatRelativeTimeOptions, Props {
    var value: Number?
    var unit: RelativeTimeFormatSingularUnit?
    var updateIntervalInSeconds: Number?
    var children: ((value: String) -> ReactElement)?
}

external interface RelativeTimeFormatInternal {
    var numberFormat: IntlNumber.NumberFormat
    var pluralRules: IntlPlural.PluralRules
    var locale: String
    var fields: LocaleFieldsData
    var style: IntlRelativeTimeFormatStyle
    var numeric: IntlRelativeTimeFormatNumeric
    var numberingSystem: String
    var initializedRelativeTimeFormat: Boolean
}

external object IntlRelativeTime {
    interface RelativeTimeFormatOptions {
        var localeMatcher: IntlRelativeTimeFormatLocaleMatcher?
        var numeric: IntlRelativeTimeFormatNumeric?
        var style: IntlRelativeTimeFormatStyle?
    }

    interface ResolvedRelativeTimeFormatOptions {
        var locale: IntlUnicodeBCP47LocaleIdentifier
        var style: IntlRelativeTimeFormatStyle
        var numeric: IntlRelativeTimeFormatNumeric
        var numberingSystem: String
    }

    interface RelativeTimeFormatPart {
        var type: String
        var value: String
        var unit: IntlRelativeTimeFormatUnit?
    }

    interface RelativeTimeFormat {
        fun format(value: Number, unit: IntlRelativeTimeFormatUnit): String
        fun formatToParts(value: Number, unit: IntlRelativeTimeFormatUnit): Array<RelativeTimeFormatPart>
        fun resolvedOptions(): ResolvedRelativeTimeFormatOptions
    }
}
